public class Parcel {
  int mLength;
  int mWidth;
  int mHeight;
  int mWeight;
  int mCost;

  public Parcel(int length, int width, int height, int weight) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
    mCost = 0;
  }

  public int determineVol() {
    return mLength * mWidth * mHeight;
  }

  public void determineCost(int distance, String speed) {
    int volume = determineVol();
    int total =0;
    total += (volume / 5.0) + (mWeight / 2.0) * (distance / 20.0);
    if(speed.equalsIgnoreCase("Express")){
      total += 20;
    }else if(speed.equalsIgnoreCase("Two Day")){
      total+=10;
    }else{
      total += 5;
    }
    System.out.println("Your package will cost " + "$" + total + " to ship!");
  }

}
