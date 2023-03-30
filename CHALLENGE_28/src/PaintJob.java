public class PaintJob {
    public static int getBucketCount(double width,double height, double  areaPerBucket, int extraBuckets)
    {
        if(width*height*areaPerBucket<=0||extraBuckets<0)
        {
            return -1;
        }
        else {
            return (int) (Math.ceil(((width * height) - extraBuckets * areaPerBucket) / areaPerBucket));
        }
    }
    public static int getBucketCount(double width,double height, double  areaPerBucket) {
        if (width * height * areaPerBucket <= 0) {
            return -1;
        }else
            return (int)(Math.ceil((width*height)/areaPerBucket));


    }
    public static int getBucketCount(double area,double  areaPerBucket)
    {
        if (area*areaPerBucket<=0)
            return -1;
        else {
            return (int)(Math.ceil(area/areaPerBucket));
        }
    }
}
