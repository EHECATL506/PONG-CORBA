package Pong;



public final class ClientePongHolder implements org.omg.CORBA.portable.Streamable
{
  public Pong.ClientePong value = null;

  public ClientePongHolder ()
  {
  }

  public ClientePongHolder (Pong.ClientePong initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Pong.ClientePongHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Pong.ClientePongHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Pong.ClientePongHelper.type ();
  }

}
