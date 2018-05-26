citys = {
	'nanjing':{'country':'china','fact':'improving'},
	'london':{'country':'UK','fact':'excellent'},
	'Tokyo':{'country':'Japan','fact':'best city in asian'},
	}
for name,info in citys.items():
	print(name + ' is belongs to ' + info['country'] + 
		',and the fact is:' + info['fact'])
