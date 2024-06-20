public class nashorn {
   public static final javax.script.ScriptEngine engine = new javax.script.ScriptEngineManager()
         .getEngineByName("nashorn");

   public static void main(String[] args) {
      try {
         System.out.println(engine.eval(

"function run(args) {" +
  "return eval(args)" +
"}" +
"run('" + String.join(" ", args) + "');"

         ));
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}