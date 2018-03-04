
public class ConsumerIncome implements Process {

	public double[] children = {.6,.3,.4,.5,.6,.6,.7,.7,.8,.8,.9};
	public double[] adult = {1.5,.9,.4,.5,.6,.4,.3,.3,.2,.2,.2};
	
	public double[] people = {2.5,1.6,1.9,2.3,2.5,2.6,2.9,3.1,3.1,3.2};
	
	public double[] consumerIncome = {17386,22935,13332,11116,16846,18201,16131,6338,7284};
	
	int index;
	
	public void calculateConsumerChild(double[] children ) {
		
		for(index = 0;index < children.length;index++) {
		double differenceChild = children.length - 1;
		
		}
	}
	
	
	public void calculateConsumerAdult(double[] adult) {
		for(index = 0;index < adult.length;index++) {
			double differenceAdult = adult.length - 1;
			}
		
		
	
	}
	@Override
	public void execute() {
		
	}
	@Override
	public boolean done() {
		return false;
	}
} 
