package patterns.model;

import patterns.model.Visitor;

public class Image implements Element {
  private String imageName;

  public Image(String imageName) {
    this.imageName = imageName;
  }

  @Override
  public void print() {
    System.out.println(imageName);
  }

  @Override
  public void add(Element element) {
    System.out.println("ERORR");
  }

  @Override
  public void remove(Element element) {
    System.out.println("ERORR");
  }

  @Override
  public Element getElement(int index) {
    System.out.println("ERORR");
    return null;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
