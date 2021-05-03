import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "personelement")
public class Person {

  @XmlAttribute(name = "personid")
  public Integer id;

  @XmlElement(name = "personname")
  public String  name;

  @XmlTransient
  public Integer age;

}
