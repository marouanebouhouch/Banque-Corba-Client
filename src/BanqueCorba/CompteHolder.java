package BanqueCorba;

/**
* BanqueCorba/CompteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* Saturday, October 28, 2017 6:54:36 PM WEST
*/

public final class CompteHolder implements org.omg.CORBA.portable.Streamable
{
  public BanqueCorba.Compte value = null;

  public CompteHolder ()
  {
  }

  public CompteHolder (BanqueCorba.Compte initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BanqueCorba.CompteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BanqueCorba.CompteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BanqueCorba.CompteHelper.type ();
  }

}
