package com.lena.designpattern.creational.factorymethod;

public abstract class VideoFactory {
    public abstract Video getVideo();
    /*
    public Video getVideo(Class c)
    {
        //Reflection
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return video;
    }

    public Video getVideo(String type)
    {
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }
        else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }
     */
}
