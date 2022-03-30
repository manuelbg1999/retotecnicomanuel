package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
///ingresar campos aqui mapeo
public class enterfields {
  //Mapeo los elementos del formulario
    ///para luego ejecutarlos desde el task
    public static final Target firstname=Target.the("FirstName").located(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
    public static final Target lastname=Target.the("Lastname").located(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
    public static final Target address=Target.the("address").located(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea"));
    public static final Target email=Target.the("email").located(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input"));
   public static final Target phone=Target.the("phone").located(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input"));
  public static final Target gender=Target.the("gender").located(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input"));
  public static final Target hobbies=Target.the("hobbies").located(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[2]/input"));
  public static final Target languages=Target.the("languages").located(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]"));
  public static final Target languages2=Target.the("languages2").located(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[35]/a"));
  public static final Target skills=Target.the("skills").located(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select"));
  public static final Target div=Target.the("div").located(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/label"));

  public static final Target country=Target.the("country").located(By.xpath(" /html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span"));
  public static final Target country2=Target.the("country2").located(By.xpath("/html/body/span/span/span[1]/input"));

  public static final Target month=Target.the("month").located(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select"));
    public static final Target day=Target.the("day").located(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select"));
    public static final Target year=Target.the("year").located(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select"));
    public static final Target pass=Target.the("pass").located(By.xpath("/html/body/section/div/div/div[2]/form/div[12]/div/input"));
    public static final Target rpass=Target.the("rpass").located(By.xpath("/html/body/section/div/div/div[2]/form/div[13]/div/input"));
    public static final Target submit=Target.the("submit").located(By.xpath("/html/body/section/div/div/div[2]/form/div[14]/div/button[1]"));





}
