public class courseG implements Analyzable{

    private GradedActivity[] gra = new GradedActivity[4];

    public void setlab(GradedActivity a){
	gra[0] = a;
    }

    public void setExam(PassFailExam a){
	gra[1] = a;
    }

    public void setEss(Essay a){
	gra[2] = a;
    }

    public void setFinal(FinalExam  a){
	gra[3] = a;
    }

    public String toString(){
	return "Lab-----" + "Score: " + gra[0].getScore() + "Grade: " + gra[0].getGrade() + "\nPass Fail Exam----"  + "Score: " + gra[1].getScore() + "Grade: " + gra[1].getGrade()+"\nEssay----" + "Score: " + gra[2].getScore() + "Grade: " + gra[2].getGrade()+"\nFinal Exam----"  + "Score: " + gra[3].getScore() + "Grade: " + gra[3].getGrade();
    }

    public double getAve(){
	double total = 0;
	for(int i = 0; i < gra.length; i++){
	    total += gra[i].getScore();
	}
	double ave = total / gra.length;
	return ave;
    }

    public GradedActivity getH(){
	GradedActivity hs = gra[0];
	for(int i = 0; i < gra.length; i++){
	    if(gra[i].getScore() > hs.getScore()){
		hs = gra[i];
	    }
	}
	return hs;
    }

   public GradedActivity getL(){
	GradedActivity ls = gra[0];
	for(int i = 0; i < gra.length; i++){
	    if(gra[i].getScore() < ls.getScore()){
		ls = gra[i];
	    }
	}
	return ls;
    }


}