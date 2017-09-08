package dddd;

import java.math.BigDecimal;
import java.util.Random;

public class LongitudeAndLatitude {
	
	/**
	 *  MinLon：最新经度  MaxLon： 最大经度   MinLat：最新纬度   MaxLat：最大纬度    type：设置返回经度还是纬度
	 * 功能:在矩形内随机生成经纬度
	 * 作者:王朋飞
	 * 2017年7月24日下午7:52:05
	 */
	  public static String randomLonLat(double MinLon, double MaxLon, double MinLat, double MaxLat, String type) {
	    Random random = new Random();
	    BigDecimal db = new BigDecimal(Math.random() * (MaxLon - MinLon) + MinLon);
	    String lon = db.setScale(6, BigDecimal.ROUND_HALF_UP).toString();// 小数后6位
	    BigDecimal setScale = db.setScale(6, BigDecimal.ROUND_HALF_UP);
	    
	    db = new BigDecimal(Math.random() * (MaxLat - MinLat) + MinLat);
	    String lat = db.setScale(6, BigDecimal.ROUND_HALF_UP).toString();
	    BigDecimal setScale2 = db.setScale(6, BigDecimal.ROUND_HALF_UP);
	    
	    if (type.equals("Lon")) {
	      return lon;
	    } else {
	      return lat;
	    }
	  }
	  public static double[] randomLonLatDouble(double MinLon, double MaxLon, double MinLat, double MaxLat) {
		    Random random = new Random();
		    BigDecimal db = new BigDecimal(Math.random() * (MaxLon - MinLon) + MinLon);
		    String lon = db.setScale(6, BigDecimal.ROUND_HALF_UP).toString();// 小数后6位
		    BigDecimal setScale = db.setScale(6, BigDecimal.ROUND_HALF_UP);
		    double lonValue = setScale.doubleValue();
		    
		    db = new BigDecimal(Math.random() * (MaxLat - MinLat) + MinLat);
		    String lat = db.setScale(6, BigDecimal.ROUND_HALF_UP).toString();
		    BigDecimal setScale2 = db.setScale(6, BigDecimal.ROUND_HALF_UP);
		    double latValue = setScale2.doubleValue();
		    double[] location = new double[2];
		    location[0] = lonValue;
		    location[1] = latValue;
		    return location;
		  }
}
