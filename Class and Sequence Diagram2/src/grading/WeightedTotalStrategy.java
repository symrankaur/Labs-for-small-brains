package grading;

public class WeightedTotalStrategy extends Missing implements GradingStratergy
{
	private java.util.Map<java.lang.String, java.lang.Double> weights;
	
	public void WeightedTotalStratergy()
	{
		
	}
	
	public void WeightedTotalStratergy(java.util.Map<java.lang.String,java.lang.Double> weights)
	
	{
		this.weights = weights;
		
	}
	
	@Override
    public Grade calculate(String key, java.util.List<Grade> grades)  
	{
        return null; // stub
    }
	
	
}
