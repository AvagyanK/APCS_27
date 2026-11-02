package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;

    double otherRating;

    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }

    public Movie(String n, double r, int num, int rev){
        movieName = n;
        rating = r;
        numRatings = num;
        revenue = rev;
    }

    public void movieToString(){
        System.out.println("Movie:" + movieName);
        System.out.println("Rating:" + rating);
        System.out.println("Number of Ratings:" + numRatings);
        System.out.println("Revenue:" + revenue);
        System.out.println("");
        return;
    }

    public String getMovieName(){
        return movieName;
    }

    public int getRevenue(){
        return revenue;
    }

    public void addRating(double newr){
        rating = ((numRatings * rating) + newr) / (numRatings + 1);
        numRatings = numRatings + 1;
        return;
    }

    public double getRating(){
        return rating;
    }

    public boolean compareRatings(Movie other){
        otherRating = other.getRating();
        if (rating > otherRating){
            return true;
        }
        else{
            return false;
        }
    }

    public String revenueToString(){
        int revenue1 = revenue%1000;
        int revenue2 = (revenue/1000)%1000;
        int revenue3 = (revenue/1000000)%1000;
        String revenueS = ""+revenue3+","+revenue2+","+ revenue1;
        return revenueS;
    }


}