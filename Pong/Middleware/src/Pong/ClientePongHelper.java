package Pong;




abstract public class ClientePongHelper
{
  private static String  _id = "IDL:Pong/ClientePong:1.0";

  public static void insert (org.omg.CORBA.Any a, Pong.ClientePong that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Pong.ClientePong extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Pong.ClientePongHelper.id (), "ClientePong");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Pong.ClientePong read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ClientePongStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Pong.ClientePong value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ClientePong narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Pong.ClientePong)
      return (Pong.ClientePong)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Pong._ClientePongStub stub = new Pong._ClientePongStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ClientePong unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Pong.ClientePong)
      return (Pong.ClientePong)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Pong._ClientePongStub stub = new Pong._ClientePongStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
