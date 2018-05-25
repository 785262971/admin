package zp_test.springboot_server.zp.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductOrderIdUtill {
	
	
	public static String getid(String type){
		StringBuffer id=new StringBuffer();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
		id.append(df.format(new Date()));
		id.append(type);
		return id.toString();
	}
	
/*	public static String getId(){
		   int num = 20;
		   
	        Format f1 = new DecimalFormat("000");
	        System.out.println(f1.format(num));
	 
	        Format f2 = new DecimalFormat("00");
	        System.out.println(f2.format(num));

	        String a="123123123123";
	        String lastTwo =  a.substring(0,a.length()-2);
	        System.out.println(a);
	        System.out.println(lastTwo);
	        return num+"";
	}*/
	/*@Test
	public void testgetid(){
	System.out.println(ProductOrderIdUtill.getId());
	}
*/

}
