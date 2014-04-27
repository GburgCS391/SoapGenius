package edu.gettysburg.cs391.soapproto;

public class Ingredient {
	
	 public String inName;
	 public int iodine, INS, hardness, cleansing, bubbly, creamy, condition, lauric, myristic, 
	 			palmitic, stearic, ricinoleic, oleic, linoleic, linolenic,
	 			sat, polyUnsat,monoUnsat, Unsat;
	 public double percent,sapKOH, sapNaOH,ukSatPerc;
	 
	 public Ingredient(Ingredient ingre, double perc){

		 percent = perc;
		 
	 }
	 public Ingredient (String name, double sKOH, double sNaOH, int iod, int ins,int lau, int linole, int myr, int ole,
			 					int pal, int ric, int ste, int linolen, int hard, int clean, int cond,
			                    int bubb, int crea, int sAt, int punsat, int munsat,int unsat, double uksatperc){
		 sapKOH = sKOH;
		 sapNaOH = sNaOH;
		 iodine = iod;
		 INS = ins;
		 hardness = hard;
		 cleansing = clean;
		 bubbly = bubb;
		 creamy = crea;
		 condition = cond; 
		 lauric = lau;
		 myristic = myr;
		 palmitic = pal;
		 stearic = ste;
		 ricinoleic = ric;
		 oleic = ole;
		 linoleic = linole;
		 linolenic = linolen;
		 sat = sAt;
		 polyUnsat = punsat;
		 monoUnsat = munsat;
		 Unsat = unsat;
		 ukSatPerc = uksatperc;
		 percent = 0;
		 
	 }
	 /*
	 
	 public String getName(){
		 return inName;
	 }
	 public int getHardness(){
		 return hardness;
	 }
	 public double getsapKOH(){
		 return sapKOH;
	 }
	 public double getsapNaOH(){
		 return sapNaOH;
	 }
	 public int getIodine(){
		 return iodine;
	 }
	 public int getINS(){
		 return INS;
	 }
	 public int getCondition(){
		 return condition;
	 }
	 public int getCleansing(){
		 return cleansing;
	 }
	 public int getBubbly(){
		 return bubbly;
	 }
	 public int getCreamy(){
		 return creamy;
	 }
	 public double getPercent(){
		 return percent;
	 }
	 */
	 public String toString(){
		 return inName + " Hardness: " + hardness +  " Cleansing: " + cleansing + " Condition: " + condition + 
				 						" Bubbly: " + bubbly + " Creamy: " + creamy + " Iodine: " + 
				 										iodine + " INS: " + INS + " Percent: " + percent;
	 }
	
	

}
