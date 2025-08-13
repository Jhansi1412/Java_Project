package cc;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter date, month and year within the range of 2001 to 2100 years in the form of DD-MM-YYYY: ");
		String s=sc.nextLine();
		sc.close();
		String[] s1=s.split("-");
        int date=Integer.parseInt(s1[0]);
		int month=Integer.parseInt(s1[1]);
		int year=Integer.parseInt(s1[2]);
		if(date<0 || date>31) {
			System.out.println("Please enter a valid date");
		}
		else if(month<0 || month>12) {
			System.out.println("Please enter a vadid month");
		}
		else if(year<2001 || year>2100) {
			System.out.println("Please enter a valid year within the given range");
		}
		else {
			char yearcode=yearCode(year);
			int monthcode=monthCode(yearcode,month);
			String week=getWeek(monthcode,date);
			System.out.print(date+"-"+month+"-"+year+" is "+week);
		}
	}
	public static char yearCode(int year) {
		int[] yeararr= {2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022,2023,2024,2025,2026,2027,2028,2029,2030,2031,2032,2033,2034,2035,2036,2037,2038,2039,2040,2041,2042,2043,2044,2045,2046,2047,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100};
		char[] ycode= {'A','B','C','K','F','G','A','I','D','E','F','N','B','C','D','L','G','A','B','J','E','F','G','H','C','D','E','M','A','B','C','K','F','G','A','I','D','E','F','N','B','C','D','L','G','A','B','J','E','F','G','H','C','D','E','M','A','B','C','K','F','G','A','I','D','E','F','N','B','C','D','L','G','A','B','J','E','F','G','H','C','D','E','M','A','B','C','K','F','G','A','I','D','E','F','N','B','C','D','E'};
		int x=0;
		int n=0;
		char yans=' ';
		if(year<=2050) { 
			x=0;
			n=50;
		}else {
			x=50;
			n=100;
		}
		for(int i=x;i<n;i++) {
			if(yeararr[i]==year) {
				yans=ycode[i];
				break;
			}
		}
		return yans;
	}
	public static int monthCode(char yearcode, int month) {
		int[] a= {1,4,4,7,2,5,7,3,6,1,4,6};
		int[] b= {2,5,5,1,3,6,1,4,7,2,5,7};
		int[] c= {3,6,6,2,4,7,2,5,1,3,6,1};
		int[] d= {4,7,7,3,5,1,3,6,2,4,7,2};
		int[] e= {5,1,1,4,6,2,4,7,3,5,1,3};
		int[] f= {6,2,2,5,7,3,5,1,4,6,2,4};
		int[] g= {7,3,3,6,1,4,6,2,5,7,3,5};
		int[] h= {1,4,5,1,3,6,1,4,7,2,5,7};
		int[] i= {2,5,6,2,4,7,2,5,1,3,6,1};
		int[] j= {3,6,7,3,5,1,3,6,2,4,7,2};
		int[] k= {4,7,1,4,6,2,4,7,3,5,1,3};
		int[] l= {5,1,2,5,7,3,5,1,4,6,2,4};
		int[] m= {6,2,3,6,1,4,6,2,5,7,3,5};
		int[] n= {7,3,4,7,2,5,7,3,6,1,4,6};
		char code=yearcode;
		int mans=0;
		switch(code){
			case 'A':
				mans=a[month-1];
				break;
			case 'B':
				mans=b[month-1];
				break;
			case 'C':
				mans=c[month-1];
				break;
			case 'D':
				mans=d[month-1];
				break;
			case 'E':
				mans=e[month-1];
				break;
			case 'F':
				mans=f[month-1];
				break;
			case 'G':
				mans=g[month-1];
				break;
			case 'H':
				mans=h[month-1];
				break;
			case 'I':
				mans=i[month-1];
				break;
			case 'J':
				mans=j[month-1];
				break;
			case 'K':
				mans=k[month-1];
				break;
			case 'L':
				mans=l[month-1];
				break;
			case 'M':
				mans=m[month-1];
				break;
			case 'N':
				mans=n[month-1];
				break;
		}
		return mans;
	}
	public static String getWeek(int monthcode,int date) {
		String[] weeks= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
		String fweek=" ";
		if(monthcode==1) {
			for(int i=1;i<=31;i++) {
				if(i==date) {
					fweek=weeks[i-1];
				}
			}
		}
		if(monthcode==2) {
			for(int i=1;i<=31;i++) {
				if(i==date) {
					fweek=weeks[(i-1)+1];
				}
			}
		}
		if(monthcode==3) {
			for(int i=1;i<=31;i++) {
				if(i==date) {
					fweek=weeks[(i-1)+2];
				}
			}
		}
		if(monthcode==4) {
			for(int i=1;i<31;i++) {
				if(i==date) {
					fweek=weeks[(i-1)+3];
				}
			}
		}
		if(monthcode==5) {
			for(int i=1;i<31;i++) {
				if(i==date) {
					fweek=weeks[(i-1)+4];
				}
			}
		}
		if(monthcode==6) {
			for(int i=1;i<31;i++) {
				if(i==date) {
					fweek=weeks[(i-1)+5];
				}
			}
		}
		if(monthcode==7) {
			for(int i=1;i<31;i++) {
				if(i==date) {
					fweek=weeks[(i-1)+6];
				}
			}
		}
		return fweek;
	}
}