public class Polygon
{
    Point [] vertices;

    Polygon(int n)
    {
        vertices = new Point[n];
    }

    Polygon()
    {
        vertices = new Point[4];
    }

    float perimeter()
    {
        float per=0;
        for (int i = 0;i < vertices.length-1; i+=1)
        {
            per += vertices[i].distance(vertices[i+1]);
        }
        per = per + vertices[vertices.length-1].distance(vertices[0]) ;
        return per;
    }
}