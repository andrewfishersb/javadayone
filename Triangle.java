public class Triangle {
  public int mSide1;
  public int mSide2;
  public int mSide3;

  public Triangle(int side1, int side2, int side3) {
    mSide1 = side1;
    mSide2 = side2;
    mSide3 = side3;
  }

  public void determineTriangle(){
    if(mSide1 > mSide2 + mSide3 || mSide2 > mSide1 + mSide3 || mSide3 > mSide1 + mSide2){
      System.out.println("This does NOT makes a triangle");

    } else if ((mSide1==mSide2 && mSide1 != mSide3) || (mSide2 == mSide3 && mSide2 != mSide1) || (mSide3 == mSide1 && mSide3 != mSide2)) {
      System.out.println("This makes an isosceles.");
    } else if (mSide1==mSide2 && mSide1==mSide3){
      System.out.println("This makes an equilateral triangle.");
    } else {
      System.out.println("This makes a scalene triangle");
    }
  }
}
