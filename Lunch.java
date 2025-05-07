public class Lunch{

public static int multiple(int num){
	int number = num * 5;
	return number;
}

public static void primeNumbers(){
	int count = 0;
	int primeCheck = 0;
	int primeCount = 0;
	int primeNum = 0;
	boolean firstFifty = true;

for (count = 1; firstFifty; count++){
	primeCount = 0;
for (primeCheck = 1; primeCheck <= count; primeCheck++){
if(count % primeCheck == 0)
	primeCount++;
}


if(primeCount == 2){
	primeNum++;
	System.out.println(+count);
}
if (primeNum == 50)
	firstFifty = false;
}
}

public static int compute(int num){
int total = 0;

if(num >= 1_000 && num <= 9_999){
	int a = (num / 1000) % 10;
	int b = (num / 100) % 10;
	int c = (num / 10) % 10;
	int d = num % 10;
	total = a + b + c + d;
}
return total;
}	

public static void findMultiples(){
String result = "";
for(count = 2000; count >=2000 && count<= 3200; count++){
	if (count % 7 == 0 && count % 5 != 0){
	result = result + count;
}
	return result;
}
}

public static boolean year(int year){

if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
	return true;
} 
else {
	return false;
}
}

public static String age(int age){
	final int noDays = 365;
	final int noMonth = 12;
	final int noMinutes = 525_600;
	final int noSecond = 31_536_000;
	
	int months = ageYears * noMonth;
	int days = ageYears * noDays;
	long minutes = ageYears * noMinutes
	long second = ageYears * noSeconds
	
	String result = "Age: " + ageYears + "years," 	+months+"months,"+days + "days,"+minutes 	+"minutes,"+seconds+"seconds";
	return result;
}
public static String dogAge(String name, int humanYears){
	final int oneHumanYear = 7;
	int dogYears = humanYear * oneHumanYear;

String result = name + "dog age is" + dogYears;
	return result;

}


}

