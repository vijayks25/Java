public class Square extends Polygon
{
    Square()
    {
        super(4);
    }

    void fill()
    {
        for (int i=0 ; i < 4 ; i+=1)
        {
            vertices[i] = new Point();
        }

        vertices[0].x = 0;
        vertices[0].y = 0;

        vertices[1].x = 0;
        vertices[1].y = 4;

        vertices[2].x = 4;
        vertices[2].y = 4;

        vertices[3].x = 4;
        vertices[3].y = 0;       

    }

    void print()
    {
        System.out.println("Perimeter of the square=" + perimeter());
    }
}