/**
  * Created by Prashant Pillai on 8/7/2016.
  */
class Upper {
  def upper(strings: String*): Seq[String] ={
    /* Just made some test change*/
    strings.map((s:String)=>s.toUpperCase)
  }
}
