 // @author Team #10285
public class PercentageAge {
	
public static void main(String[] args) {
	
	double numberofAdults = 1;
	double numberofChildren = 1;

	  double[] children = {.6,.3,.4,.5,.6,.6,.7,.7,.8,.8,.9};
	  
	  // 18-64
	  double[] adult = {1.0,1.2,1.5,1.7,1.9,2.1,2.1,2.1,.9,1.0};
	  // Above 64
	 double[] elderlyAdult = {.4,.5,.6,.4,.3,.3,.2,.2,.2};
	  
		// 0-2
		  double[] childrenT = {15.0,41.0,42.0,36.0,72.0,94.0,122.0,134.0,91.0};
		//3-15 years
		  double[] childrenA = {93.0,89.0,140.0,211.0,152.0,253.0,303.0,371.0,469.0,};
		// 16-18 years
		  double[] childrenE = {474.0,482.0,659.0,656.0,839.0,999.0,1257.0,1834.0,2445.0};
		
	 double[] consumerIncome = {17386,22935,13332,11116,16846,18201,16131,6338,7284};
	 double result =  calculateConsumerAdult(adult,consumerIncome,elderlyAdult,numberofAdults) + 
calculateConsumerChild(children,consumerIncome,childrenT,childrenA,childrenE,numberofChildren);
//	System.out.println(calculateConsumerChild(children,consumerIncome,childrenT,
//	 childrenA,childrenE));
// System.out.println(calculateConsumerAdult(adult,consumerIncome,elderlyAdult));
	System.out.println(result);
		
	}

	public  double[] children = {.6,.3,.4,.5,.6,.6,.7,.7,.8,.8,.9};
	// 0-2
	public  double[] childrenT = {15.0,41.0,42.0,36.0,72.0,94.0,122.0,134.0,91.0};
	//3-15 years
	public  double[] childrenA = {93.0,89.0,140.0,211.0,152.0,253.0,303.0,371.0,469.0,};
	// 16-18 years
	public  double[] childrenE = {474.0,482.0,659.0,656.0,839.0,999.0,1257.0,1834.0,2445.0};



	public double[] adult = {1.5,.9,1.0,1.2,1.5,1.7,1.9,2.1,2.1,2.1};
	public double[] elderlyAdult = {.4,.4,.5,.6,.4,.3,.3,.2,.2,.2};
	public double[] consumerIncome = {17386,22935,13332,11116,16846,18201,16131,6338,7284};

	
	public static double calculateConsumerChild(double[] children, 
	double[] consumerIncome,double[] childrenT,double[] childrenA, 
	double[] childrenE,double numberofChildren ) {
		
		int  index = -1;
		double differenceChild = 0;
        int num = children.length;
		double[] childrenValue = new double[num];
		childrenValue[0] = 0;
		
				for(index = 0;index < children.length ;index++) {
		 childrenValue[index+1] = ((consumerIncome[index+1]+childrenT[index+1])/
				 (1/Math.abs(children[index+1]-numberofChildren)+.01));
		 
		 System.out.println( childrenValue[index+1]);
		}
		return differenceChild;
	}	
	public static double calculateConsumerAdult(double[] adult,
			double[] consumerIncome,double[] elderlyAdult,double numberofAdults) {
	int  index = -1;
	double differenceAdult = 0;
    int num = adult.length;
	double[] adultValue = new double[num];
	adultValue[0] = 0;
	
			for(index = 0;index < adult.length ;index++) {
	 adultValue[index+1] = ((consumerIncome[index+1])/
			 (1/Math.abs(adult[index+1]-numberofAdults)+.01));
	 
	 System.out.println( adultValue[index+1]);
	}
	return differenceAdult;
}
}


