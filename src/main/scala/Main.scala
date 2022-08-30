import org.apache.spark.sql.SparkSession

object Main extends App {
  val spark = SparkSession.builder()
    .appName("MySparkApp")
    .master("spark://localhost:7077")
    .getOrCreate()
  println(spark)
}