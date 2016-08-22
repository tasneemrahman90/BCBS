package packageAPI; ````````````````````````````````````````````

public class API {

	public static void main(String[] args) {
		
		String theCatInTheHat = "The sun did not shine. It was too wet to play. So we sat in the house. All that cold, cold, wet day.";
		String oneFishTwoFish = "One fish, two fish, red fish, blue fish.";
		
		System.out.println(theCatInTheHat.toUpperCase());
		System.out.println(theCatInTheHat.toLowerCase());
		System.out.println(theCatInTheHat.length());
		System.out.println(theCatInTheHat.charAt(5));
		System.out.println(theCatInTheHat.replace("cold","boring"));
		System.out.println(theCatInTheHat.replace('t','x'));
		System.out.println(theCatInTheHat.substring(20,50));
		System.out.println(theCatInTheHat.endsWith("day."));
		System.out.println(theCatInTheHat.startsWith("The"));
		System.out.println(theCatInTheHat.replaceAll(theCatInTheHat, oneFishTwoFish));
		System.out.println(oneFishTwoFish.hashCode());
		System.out.println(oneFishTwoFish.getBytes());
		System.out.println(oneFishTwoFish.getClass());
		System.out.println(oneFishTwoFish.contentEquals(theCatInTheHat));
		System.out.println(oneFishTwoFish.contains("fish"));
		System.out.println(oneFishTwoFish.isEmpty());
		System.out.println(oneFishTwoFish.intern());
	}

}
