  public class Vehicle{
    public int mCost;
    public String mBrand;
    public int mYear;

    public Vehicle(int cost, String brand, int year){
      mCost = cost;
      mBrand = brand;
      mYear = year;
    }

    public boolean worthBuying(int maxPrice) {
      return (mPrice < maxPrice);
    }

  }
