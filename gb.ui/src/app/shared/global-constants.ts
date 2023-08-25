export class GlobalConstants {
  //Message
  public static genericError: string =
    'Some thing went wrong, please try again';

  public static unauthorized: string =
    'You are not allowed to access this page.';

  public static productExistError: string = 'Product already exists';

  public static productAdded: string = 'Product added successfully';
  //Regex
  public static nameRegex = '[a-zA-Z0-9 ]*';
  public static emailRegex = '[A-Za-z0-9._%-]+@[A-Za-z0-9._%-]+\\.[a-z]{2,3}';
  public static contactNumberRegex = '^[e0-9]{10,10}$';

  //Variables
  public static error: string = 'error';
}
