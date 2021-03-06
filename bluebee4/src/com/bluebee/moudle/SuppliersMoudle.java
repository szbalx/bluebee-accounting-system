package com.bluebee.moudle;

import com.bluebee.dao.SuppliersDAO;
import com.bluebee.pojo.Suppliers;

import java.util.List;

public abstract interface SuppliersMoudle
{
  public abstract void setSuppliersDAO(SuppliersDAO paramSuppliersDAO);

  public abstract void insertSuppliers(Suppliers paramSuppliers);

  public abstract void deleteSuppliers(String paramString);

  public abstract void updateSuppliers(Suppliers paramSuppliers);

  public abstract List<String> getSuppliersByName(String paramString, int paramInt);

  public abstract List getSuppliers();

  public abstract List getSuppliers(int paramInt1, int paramInt2);

  public abstract int getSuppliersSize();

  public abstract Suppliers getSuppliersByNo(String paramString);

  public abstract List getSuppliers(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2);

  public abstract int getSuppliersSize(String paramString1, String paramString2, String paramString3);
}