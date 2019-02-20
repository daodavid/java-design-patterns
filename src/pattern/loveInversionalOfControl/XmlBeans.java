package pattern.loveInversionalOfControl;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "beans")
  public class XmlBeans {


    public void setNames(List<ClassNames> classNames) {
        this.classNames = classNames;
    }
    @XmlElement(name = "class")
    public List<ClassNames> getNames() {
        return classNames;
    }

    public List<ClassNames> classNames;

}