package CalcApp.CalcPackage;

/**
* CalcApp/CalcPackage/DivisionByZeroHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from src/Calc.idl
* Saturday, 2 July, 2022 8:57:54 AM IST
*/

public final class DivisionByZeroHolder implements org.omg.CORBA.portable.Streamable
{
  public CalcApp.CalcPackage.DivisionByZero value = null;

  public DivisionByZeroHolder ()
  {
  }

  public DivisionByZeroHolder (CalcApp.CalcPackage.DivisionByZero initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CalcApp.CalcPackage.DivisionByZeroHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CalcApp.CalcPackage.DivisionByZeroHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CalcApp.CalcPackage.DivisionByZeroHelper.type ();
  }

}
