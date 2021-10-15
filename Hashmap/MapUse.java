package HashMap;

public class MapUse {

	public static void main(String[] args) {
		Map<String,Integer> map=new Map<>();
		
		for(int i=0;i<20;i++) {
			map.insert("abc", i+1);
			System.out.println(i+" "+map.loadfactor());
		}
	}

}
