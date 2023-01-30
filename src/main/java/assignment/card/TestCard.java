package assignment.card;
public class TestCard implements cloneable{
	Long cardnum;
	String cardname;
	String exdate;
	TestCard(String cardname,Long cardnum,String exdate)
	{
		this.cardnum = cardnum;
		this.cardname = cardname;
		this.exdate = exdate;
	}
	TestCard clo()
	{
		try{
    		return (TestCard)super.clone();
    		
    	}
    	catch(CloneNotSupportedException e)
    	{
    		log.info("Clowning error");
    		return this;
    	}
	}
	boolean test(Long valnum)
	{
		return valnum.equals(cardnum);
	}
}
