package Pong;




public class _ClientePongStub extends org.omg.CORBA.portable.ObjectImpl implements Pong.ClientePong
{

  public void actualizar (int barra1, int barra2, int x, int y, int puntos1, int puntos2)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizar", true);
                $out.write_long (barra1);
                $out.write_long (barra2);
                $out.write_long (x);
                $out.write_long (y);
                $out.write_long (puntos1);
                $out.write_long (puntos2);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                actualizar (barra1, barra2, x, y, puntos1, puntos2        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizar

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Pong/ClientePong:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ClientePongStub
