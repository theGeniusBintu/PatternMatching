class Library {

  def library_customers(members : String) = {
    members match {
      case "Junior Member" => "You can borrow two books"
      case "Regular Member" => "You can borrow five books"
      case "Senior citizen" => "As many books as you need please"
    }
  }
}
