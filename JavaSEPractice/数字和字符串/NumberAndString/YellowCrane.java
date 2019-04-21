package NumberAndString;

import java.util.Scanner;

/**
 * 借助Scanner 读取字符串数据，然后用格式化输出下面
 * 浙江温州最大皮革厂江南皮革厂倒闭了，王八蛋老板黄鹤吃喝嫖赌，欠下了3.5个亿，
 * 带着他的小姨子跑了!我们没有办法，拿着钱包抵工资!原价都是一百多、两百多、三百多的钱包，现在全部只卖二十块，
 * 统统只要二十块!黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!
 * ......
 * 具体题目请看http://how2j.cn/k/number-string/number-string-foramt/320.html#step2199
 */
public class YellowCrane {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入地名");
        String address = sc.nextLine();

        System.out.println("请输入公司类型");
        String company = sc.nextLine();

        System.out.println("公司名称");
        String companyName = sc.nextLine();

        System.out.println("老板名称");
        String boss = sc.nextLine();

        System.out.println("金额");
        String money = sc.nextLine();

        System.out.println("产品");
        String product = sc.nextLine();

        System.out.println("计量单位");
        String unit = sc.nextLine();

        System.out.println(address + company + companyName + "倒闭了，\n" +
                "王八蛋老板" + boss + "吃喝嫖赌，欠下了" + money + "个亿，带着他的小姨子跑了!\n" +
                "我们没有办法，拿着" +product + "抵工资!\n原价都是一"
                + unit + "多、两" + unit + "多、三" + unit +"多的" + product + "，\n" +
                "现在全部只卖二十块，统统只要二十块!\n" + boss + "王八蛋，\n" +
                "你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!");
    }
}
