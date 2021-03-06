package org.testng.internal;

import org.testng.IInstanceInfo;

public class InstanceInfo implements IInstanceInfo {
  private Class m_instanceClass = null;
  private Object m_instance = null;
  
  public InstanceInfo(Class cls, Object instance) {
    m_instanceClass = cls;
    m_instance = instance;
  }

  public Object getInstance() {
    return m_instance;
  }

  public Class getInstanceClass() {
    return m_instanceClass;
  }

}
