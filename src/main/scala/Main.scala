import org.apache.spark.sql.SparkSession

object Main {
  def main (args: Array[String]) = {
    val logfile = "README.md"
    val spark = SparkSession
      .builder
      .appName("MyApp")
      .config("spark.master", "spark://localhost:7077")
      .getOrCreate()
    val logData = spark.read.textFile(logfile)
    val numAs = logData.filter(line => line.contains("a")).count()
    println(numAs)
    spark.stop()
  }
}