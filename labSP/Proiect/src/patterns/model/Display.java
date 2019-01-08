
package patterns.model;

public class Display implements Visitor {
  private String imageMessages = "";
  private String paragraphMessages = "";

  @Override
  public void visit(Image image) {
    image.print();
  }

  @Override
  public void visit(ImageProxy imageProxy) {
  }

  @Override
  public void visit(Paragraph paragraph) {
    paragraph.print();
  }

  @Override
  public void visit(Table table) {
  }

  @Override
  public void visit(Book book) {
  }

  public void printStatistics() {
    System.out.println("Book Statistics:");
  }

  @Override
  public void visit(Section section) {
  }

public String getImageMessages() {
	return imageMessages;
}

public void setImageMessages(String imageMessages) {
	this.imageMessages = imageMessages;
}

public String getParagraphMessages() {
	return paragraphMessages;
}

public void setParagraphMessages(String paragraphMessages) {
	this.paragraphMessages = paragraphMessages;
}

}
