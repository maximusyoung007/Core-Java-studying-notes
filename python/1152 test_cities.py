import unittest
from city_function import Country

class CityTestCase(unittest.TestCase):
    def test_city_country_name(self):
        info = Country('nanjing','china')
        self.assertEqual(info,"Nanjing China")

    def test_City_Country_population(self):
        info = Country('Nanjing', 'China', '2000')
        self.assertEqual(info,'Nanjing China 2000')
unittest.main()