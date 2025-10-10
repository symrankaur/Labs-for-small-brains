package grading;

public interface Filter 
{
	public java.util.List<Grade> apply(java.util.List<Grade> grades);
}
