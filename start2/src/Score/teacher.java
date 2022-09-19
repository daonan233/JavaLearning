package Score;

public class teacher {
    public void checkScore(int score) throws ScoreException
    {
        if(score<0||score>100)
            throw new ScoreException();
        System.out.println("分数正常");
    }


}
