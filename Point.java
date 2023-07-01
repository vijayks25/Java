public class Point
{
    float x,y;
    
    float distance(Point p2)
    {
      return (float) Math.sqrt((x - p2.x) * (x - p2.x) + (y - p2.y) * (y - p2.y)) ;   
    }
}