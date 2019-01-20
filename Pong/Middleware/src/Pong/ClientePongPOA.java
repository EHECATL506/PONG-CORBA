package Pong;

public abstract class ClientePongPOA extends org.omg.PortableServer.Servant
        implements Pong.ClientePongOperations, org.omg.CORBA.portable.InvokeHandler{

    // Constructors

    private static java.util.Hashtable _methods = new java.util.Hashtable ();
    static
    {
        _methods.put ("actualizar", new Integer (0));
    }

    public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                                        org.omg.CORBA.portable.InputStream in,
                                                        org.omg.CORBA.portable.ResponseHandler $rh)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        Integer __method = (Integer)_methods.get ($method);
        if (__method == null)
            throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

        switch (__method.intValue ())
        {
            case 0:
            {
                int barra1 = in.read_long ();
                int barra2 = in.read_long ();
                int x = in.read_long ();
                int y = in.read_long ();
                int puntos1 = in.read_long ();
                int puntos2 = in.read_long ();
                this.actualizar (barra1, barra2, x, y, puntos1, puntos2);
                out = $rh.createReply();
                break;
            }

            default:
                throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
        }

        return out;
    } // _invoke

    // Type-specific CORBA::Object operations
    private static String[] __ids = {
            "IDL:Pong/ClientePong:1.0"};

    public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
    {
        return (String[])__ids.clone ();
    }

    public ClientePong _this()
    {
        return ClientePongHelper.narrow(
                super._this_object());
    }

    public ClientePong _this(org.omg.CORBA.ORB orb)
    {
        return ClientePongHelper.narrow(
                super._this_object(orb));
    }


} // class ClientePongPOA