package Pong;




abstract public class ServidorPongHelper
{
  private static String  _id = "IDL:Pong/ServidorPong:1.0";

  public static void insert (org.omg.CORBA.Any a, Pong.ServidorPong that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Pong.ServidorPong extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Pong.ServidorPongHelper.id (), "ServidorPong");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Pong.ServidorPong read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ServidorPongStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Pong.ServidorPong value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Pong.ServidorPong narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Pong.ServidorPong)
      return (Pong.ServidorPong)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Pong._ServidorPongStub stub = new Pong._ServidorPongStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Pong.ServidorPong unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Pong.ServidorPong)
      return (Pong.ServidorPong)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Pong._ServidorPongStub stub = new Pong._ServidorPongStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
