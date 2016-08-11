/**
  * Created by Prashant Pillai on 8/7/2016.
  */
class Upper {
  def upper(strings: String*): Seq[String] ={

    strings.map((s:String)=>s.toUpperCase)
  }
}
