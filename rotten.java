public class rotten {
    public static double reviewAvgRating(int[][] ratings, int movie){
        double tot=0;
        for(int i=0;i<ratings.length;i++){
            tot+=ratings[i][movie];
        }
        tot=tot/ratings.length;
        return tot;
    }

    public static double reviewerAvgRating(int[][] ratings,int reviewer){
        double tot=0;
        for(int i=0;i<ratings[0].length;i++){
            tot+=ratings[reviewer][i];
        }
        tot=tot/ratings[0].length;
        return tot;
    }

    public static double avgRating2018(int[][] ratings){
        double tot=0;
        for(int i=0;i<ratings.length;i++) {
            for (int j = 0; j < ratings[i].length; j++) {
                tot += ratings[i][j];
            }
        }
        tot=tot/((ratings[0].length)*(ratings.length));
        return tot;
    }

    public static int hardestRater2018(int[][] ratings) {
//        double[] reviewrs= new double[ratings.length];
        double lowest = 99;
        int lowNum=0;
        for (int i = 0; i < ratings.length; i++) {
            if (reviewerAvgRating(ratings, i) < lowest) {
                lowest = reviewerAvgRating(ratings, i);
                lowNum = i;
            }
        }
        return lowNum;
    }

    public static int worstMovie2018(int [][] ratings){
        double lowest = 99;
        int lowNum=0;
        for (int i = 0; i < ratings[0].length; i++) {
            if (reviewAvgRating(ratings, i) < lowest) {
                lowest = reviewAvgRating(ratings, i);
                lowNum = i;
            }
        }
        return lowNum;
    }


    public static void main(String[] args) {
        int[][] ratings ={ {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };

        System.out.println(reviewAvgRating(ratings,0));
        System.out.println(reviewerAvgRating(ratings,2));
        System.out.println(avgRating2018(ratings));
        System.out.println(hardestRater2018(ratings));
        System.out.println(worstMovie2018(ratings));
    }
}
