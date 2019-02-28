package xmltest;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.File;
import java.util.List;

public class Maintest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//创建sax对象
		SAXReader reader = new SAXReader();
		//指定解析的xml源
		Document document = reader.read(new File("src/xml/stus.xml"));
		//得到元素
		System.out.println(document.getName());
		//得到根元素
		Element rootElement = document.getRootElement();
		Element nameElement = (Element)rootElement.selectSingleNode("//name");
		System.out.println(nameElement.getText());
		
		List<Element> list = rootElement.selectNodes("//name");
		for(Element element : list) {
			System.out.println(element.getText());
		}
		/*System.out.println(rootElement.getName());
		//得到根元素下面的子元素
		System.out.println(rootElement.element("stu").element("age").getStringValue());
		//获取根元素下面的所有子元素 stu元素
		List<Element> elements = rootElement.elements();
		System.out.println(elements.size());
		for(Element element : elements) {
			String name = element.element("name").getText();
			String age = element.element("address").getText();
			String address = element.element("age").getText();
			System.out.println("name:" + name + " age:" + age + " address:" + address);
		}*/
	}

}
