package grading;

public class DropFilter implements Filter
{
	private boolean shouldDropLowest;
	private boolean shouldDropHighest;
	
	DropFilter()
	{
		
	}
	
	void DropFilter(boolean shouldDropLowest, boolean shouldDropHighest)
	{
		this.shouldDropLowest =shouldDropLowest;
		this.shouldDropHighest=shouldDropHighest;
	}
	
	@Override
    public java.util.List<Grade> apply(java.util.List<Grade> grades) {
        return grades;
    }
}
