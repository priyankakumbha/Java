class O
{
  static int test1()
  {
    try
    {

    }
    catch(ArithmeticException ex)
    {

    }
    finally{

    }
    return 10;
  }
  static int test2()
  {
    try
    {
return 10;
    }
    catch(ArithmeticException ex)
    {
return 20;
    }
    finally{

    }
  }
    static int test3()
    {
      try
      {
  return 10;
      }
      catch(ArithmeticException ex)
      {
  return 20;
      }
      finally{
return 30;
      }

}
static int test4()
{
  try
  {

  }
  catch(ArithmeticException ex)
  {

  }
  finally{
return 30;
  }

}
static int test5()
{
  try
  {

  }
  catch(ArithmeticException ex)
  {

  }
  finally{
return 30;
  }
  return 40;
}
static int test6()
{
  try
  {
return 30;
  }
  catch(ArithmeticException ex)
  {
return 20;
  }
  finally{

  }
  return 40;
}
static int test7()
{
  try
  {
return 30;
  }
  catch(ArithmeticException ex)
  {

  }
  finally{

  }
  return 40;
}
}
