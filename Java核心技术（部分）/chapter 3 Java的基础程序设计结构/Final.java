public class Final {
		public static final double CM_PER_INCH = 2.54;//constant,if in a method,only final,can't use const
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double paperwidth =  8.5;
		double paperheight = 11;
		System.out.println("Paper size in centimeters:" + 
		paperwidth * CM_PER_INCH + " by " + paperheight * CM_PER_INCH);
	}

}
