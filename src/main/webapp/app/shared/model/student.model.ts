


export interface IStudent {
  id?: number;
  hoTen?: string;
  maGioiTinh?: string;
  ngaySinh ? :string ;
  quocTich ?: string ;
  maSinhVien? :string ;
 }

export class StudentModel implements IStudent {
  constructor(
  public  id?: number,
  public hoTen?: string,
  public maGioiTinh?: string,
  public ngaySinh ? :string ,
 public quocTich ?: string ,
  public maSinhVien? :string
  ) {}
}
