package com.dwls.dao;
/**
 * 
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dwls.bean.BillData;
import com.dwls.utility.GlobalResource;

/**
 * @author lenovo
 *
 */
public class BillDataDAO {
	
	private  final String ID = "id"; 
	private  final String DIV_NAME = "div_name";
	private  final String TARIFF = "tariff";
	private  final String LOC_CODE_1 = "loc_code_1";
	private  final String GROUP_NO_1 = "group_no_1";
	private  final String READER_NO_1 = "reader_no_1";
	private  final String CONS_NO_1 = "cons_no_1";
	private  final String BILL_MONTH_1 = "bill_month_1";
	private  final String BILL_NO_1 = "bill_no_1";
	private  final String BILL_DATE = "bill_date";
	private  final String TOT_UNITS_1 = "tot_units_1";
	private  final String CONS_NAME_1 = "cons_name_1";
	private  final String ADDR_1 = "addr_1";
	private  final String NET_BILL_1 = "net_bill_1";
	private  final String ADDR_2 = "addr_2";
	private  final String ADDR_3 = "addr_3";
	private  final String PHONE_1 = "phone_1";
	private  final String MOBILE = "mobile";
	private  final String CHQ_DATE_1 = "chq_date_1";
	private  final String CSH_DATE_1 = "csh_date_1";
	private  final String POLE = "pole";
	private  final String METER_NO = "meter_no";
	private  final String PHASE = "phase";
	private  final String RDG_DATE = "rdg_date";
	private  final String CONN_LOAD = "conn_load";
	private  final String LOAD_UNIT = "load_unit";
	private  final String RDG_TYPE = "rdg_type";
	private  final String CONT_DEM = "cont_dem";
	private  final String MAX_DEM = "max_dem";
	private  final String RDG_CURR = "rdg_curr";
	private  final String RDG_PRE = "rdg_pre";
	private  final String MF = "mf";
	private  final String PF = "pf";
	private  final String MTR_UNITS = "mtr_units";
	private  final String ASS_UNITS = "ass_units";
	private final String TOT_UNITS_2 = "tot_units_2";
	private final String TOD_UNITS = "tod_units";
	private final String LOC_NAME = "loc_name";
	private final String LOC_ADDR_1 = "loc_addr_1";
	private final String ENCH = "ench";
	private final String LOC_ADDR_2 = "loc_addr_2";
	private final String FXCH = "fxch";
	private final String LOC_PHONE = "loc_phone";
	private final String DUTY = "duty";
	private final String CESS = "cess";
	private final String RENT = "rent";
	private final String OFFR_NAME = "offr_name";
	private final String ADJMT = "adjmt";
	private final String OFFR_PHONE = "offr_phone";
	private final String SD_INST = "sd_inst";
	private final String CAP_SCH = "cap_sch";
	private final String DE_NAME = "de_name";
	private final String PENAL_CH = "penal_ch";
	private final String DE_PHONE = "de_phone";
	private final String TOD_SCH = "tod_sch";
	private final String PURPOSE = "purpose";
	private final String SEC_DEP = "sec_dep";
	private final String OCH = "och";
	private final String BILL_TYPE = "bill_type";
	private final String SD_DUE = "sd_due";
	private final String ADV_AMT = "adv_amt";
	private final String SD_INT = "sd_int";
	private final String PRE_PYMT_HDR = "pre_pymt_hdr";
	private final String LF_REBATE = "lf_rebate";
	private final String CASH_MSG_1 = "cash_msg_1";
	private final String LOCK_CR = "lock_cr";
	private final String CASH_MSG_2 = "cash_msg_2";
	private final String SUBSIDY = "subsidy";
	private final String CASH_MSG_3 = "cash_msg_3";
	private final String MONTH_BILL = "month_bill";
	private final String ARRS = "arrs";
	private final String NET_BILL_2 = "net_bill_2";
	private final String MONTH_1 = "month_1";
	private final String RDG_DATE_1 = "rdg_date_1";
	private final String RDG_1 = "rdg_1";
	private final String SURCH = "surch";
	private final String MONTH_2 = "month_2";
	private final String RDG_DATE_2 = "rdg_date_2";
	private final String RDG_2 = "rdg_2";
	private final String NET_INCL_SURCH_1 = "net_incl_surch_1";
	private final String MONTH_3 = "month_3";
	private final String RDG_DATE_3 = "rdg_date_3";
	private final String RDG_3 = "rdg_3";
	private final String MONTH_4 = "month_4";
	private final String RDG_DATE_4 = "rdg_date_4";
	private final String RDG_4 = "rdg_4";
	private final String MONTH_5 = "month_5";
	private final String RDG_DATE_5 = "rdg_date_5";
	private final String RDG_5 = "rdg_5";
	private final String MONTH_6 = "month_6";
	private final String RDG_DATE_6 = "rdg_date_6";
	private final String RDG_6 = "rdg_6";
	private final String AVG_1 = "avg_1";
	private final String AVG_2 = "avg_2";
	private final String CIR_NAME_2 = "cir_name_2";
	private final String BILL_MSG_1 ="bill_msg_1";
	private final String BILL_MSG_2 = "bill_msg_2";
	private final String BILL_MSG_3 = "bill_msg_3";
	private final String BILL_MSG_4 = "bill_msg_4";
	private final String BILL_MSG_5 = "bill_msg_5";
	private final String SCRN_MSG = "scrn_msg";
	private final String BILL_MONTH_2 = "bill_month_2"; 
	private final String BILL_NO_2 = "bill_no_2";
	private final String LOC_COD_2 = "loc_cod_2";
	private final String GROUP_NO_2 = "group_no_2";
	private final String READER_NO_2 = "reader_no_2";
	private final String CONS_NO_2 = "cons_no_2";
	private final String CONS_NAME_2 = "cons_name_2";
	private final String CHQ_DATE_2 = "chq_date_2";
	private final String CSH_DATE_2 = "csh_date_2";
	private final String NET_BILL_3 = "net_bill_3";
	private final String NET_INCL_SURCH_2 = "net_incl_surch_2";
	private final String OLD_CONS_NO = "old_cons_no";
	private final String SURCHARGE_DEMAND = "surcharge_demand";
	private final String PREV_PENDING_AMNT = "prev_pending_amnt";
	private final String MTR_READER_NAME = "mtr_reader_name";
	
	public BillData insert(BillData billData){
		BillData insertedBillData = null;
		int lastInsertedId = -1;
		if(billData != null){
			try(
					Connection connection = GlobalResource.getDatasource().getConnection();
					PreparedStatement ps = connection.prepareStatement(
							"INSERT INTO pre_bill_data("+DIV_NAME+"," +TARIFF+"," +LOC_CODE_1+"," +GROUP_NO_1+"," +READER_NO_1+"," +CONS_NO_1+"," +BILL_MONTH_1+"," +BILL_NO_1+"," +BILL_DATE+"," +TOT_UNITS_1+"," +CONS_NAME_1+"," +ADDR_1+"," +NET_BILL_1+"," +ADDR_2+"," +ADDR_3+"," +PHONE_1+"," +MOBILE+"," +CHQ_DATE_1+"," +CSH_DATE_1+"," +POLE+"," +METER_NO+"," +PHASE+"," +RDG_DATE+"," +CONN_LOAD+"," +LOAD_UNIT+"," +RDG_TYPE+"," +CONT_DEM+"," +MAX_DEM+"," +RDG_CURR+"," +RDG_PRE+"," +MF+"," +PF+"," +MTR_UNITS+"," +ASS_UNITS+"," +TOT_UNITS_2+"," +TOD_UNITS+"," +LOC_NAME+"," +LOC_ADDR_1+"," +ENCH+"," +LOC_ADDR_2+"," +FXCH+"," +LOC_PHONE+"," +DUTY+"," +CESS+"," +RENT+"," +OFFR_NAME+"," +ADJMT+"," +OFFR_PHONE+"," +SD_INST+"," +CAP_SCH+"," +DE_NAME+"," +PENAL_CH+"," +DE_PHONE+"," +TOD_SCH+"," +PURPOSE+"," +SEC_DEP+"," +OCH+"," +BILL_TYPE+"," +SD_DUE+"," +ADV_AMT+"," +SD_INT+"," +PRE_PYMT_HDR+"," +LF_REBATE+"," +CASH_MSG_1+"," +LOCK_CR+"," +CASH_MSG_2+"," +SUBSIDY+"," +CASH_MSG_3+"," +MONTH_BILL+"," +ARRS+"," +NET_BILL_2+"," +MONTH_1+"," +RDG_DATE_1+"," +RDG_1+"," +SURCH+"," +MONTH_2+"," +RDG_DATE_2+"," +RDG_2+"," +NET_INCL_SURCH_1+"," +MONTH_3+"," +RDG_DATE_3+"," +RDG_3+"," +MONTH_4+"," +RDG_DATE_4+"," +RDG_4+"," +MONTH_5+"," +RDG_DATE_5+"," +RDG_5+"," +MONTH_6+"," +RDG_DATE_6+"," +RDG_6+"," +AVG_1+"," +AVG_2+"," +CIR_NAME_2+"," +BILL_MSG_1+"," +BILL_MSG_2+"," +BILL_MSG_3+"," +BILL_MSG_4+"," +BILL_MSG_5+"," +SCRN_MSG+"," +BILL_MONTH_2+"," +BILL_NO_2+"," +LOC_COD_2+"," +GROUP_NO_2+"," +READER_NO_2+"," +CONS_NO_2+"," +CONS_NAME_2+"," +CHQ_DATE_2+"," +CSH_DATE_2+"," +NET_BILL_3+"," +NET_INCL_SURCH_2+"," +OLD_CONS_NO+"," +SURCHARGE_DEMAND+"," +PREV_PENDING_AMNT+"," +MTR_READER_NAME+")"
									+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
							Statement.RETURN_GENERATED_KEYS);
					) {
				
				
				ps.setString(1, billData.getDivName()); 
				ps.setString(2, billData.getTariff()); 
				ps.setString(3, billData.getLocCode1()); 
				ps.setString(4, billData.getGroupNo1());
				ps.setString(5, billData.getReaderNo1()); 
				ps.setString(6, billData.getConsNo1()); 
				ps.setString(7, billData.getBillMonth1()); 
				ps.setString(8, billData.getBillNo1()); 
				ps.setString(9, billData.getBillDate()); 
				ps.setString(10, billData.getTotUnits1()); 
				ps.setString(11, billData.getConsName1()); 
				ps.setString(12, billData.getAddr1()); 
				ps.setString(13, billData.getNetBill1()); 
				ps.setString(14, billData.getAddr2()); 
				ps.setString(15, billData.getAddr3()); 
				ps.setString(16, billData.getPhone1()); 
				ps.setString(17, billData.getMobile()); 
				ps.setString(18, billData.getChqDate1()); 
				ps.setString(19, billData.getCshDate1()); 
				ps.setString(20, billData.getPole()); 
				ps.setString(21, billData.getMeterNo()); 
				ps.setString(22, billData.getPhase()); 
				ps.setString(23, billData.getRdgDate()); 
				ps.setString(24, billData.getConnLoad()); 
				ps.setString(25, billData.getLoadUnit()); 
				ps.setString(26, billData.getRdgType()); 
				ps.setString(27, billData.getContDem()); 
				ps.setString(28, billData.getMaxDem()); 
				ps.setString(29, billData.getRdgCurr()); 
				ps.setString(30, billData.getRdgPre()); 
				ps.setString(31, billData.getMf()); 
				ps.setString(32, billData.getPf()); 
				ps.setString(33, billData.getMtrUnits()); 
				ps.setString(34, billData.getAssUnits()); 
				ps.setString(35, billData.getTotUnits2()); 
				ps.setString(36, billData.getTodUnits()); 
				ps.setString(37, billData.getLocName()); 
				ps.setString(38, billData.getLocAddr1()); 
				ps.setString(39, billData.getEnch()); 
				ps.setString(40, billData.getLocAddr2()); 
				ps.setString(41, billData.getFxch()); 
				ps.setString(42, billData.getLocPhone()); 
				ps.setString(43, billData.getDuty()); 
				ps.setString(44, billData.getCess()); 
				ps.setString(45, billData.getRent()); 
				ps.setString(46, billData.getOffrName()); 
				ps.setString(47, billData.getAdjmt()); 
				ps.setString(48, billData.getOffPhone()); 
				ps.setString(49, billData.getSdInst()); 
				ps.setString(50, billData.getCapSch()); 
				ps.setString(51, billData.getDeName()); 
				ps.setString(52, billData.getPenalCh()); 
				ps.setString(53, billData.getDePhone()); 
				ps.setString(54, billData.getTodSch()); 
				ps.setString(55, billData.getPurpose()); 
				ps.setString(56, billData.getSecDep()); 
				ps.setString(57, billData.getOch()); 
				ps.setString(58, billData.getBillType()); 
				ps.setString(59, billData.getSdDue()); 
				ps.setString(60, billData.getAdvAmt()); 
				ps.setString(61, billData.getSdInt()); 
				ps.setString(62, billData.getPrePymtHdr()); 
				ps.setString(63, billData.getLfRebate()); 
				ps.setString(64, billData.getCashMsg1()); 
				ps.setString(65, billData.getLockCr()); 
				ps.setString(66, billData.getCashMsg2()); 
				ps.setString(67, billData.getSubsidy());
				ps.setString(68, billData.getCashMsg3()); 
				ps.setString(69, billData.getMonthBill()); 
				ps.setString(70, billData.getArrs()); 
				ps.setString(71, billData.getNetBill2()); 
				ps.setString(72, billData.getMonth1()); 
				ps.setString(73, billData.getRdgDate1()); 
				ps.setString(74, billData.getRdg1()); 
				ps.setString(75, billData.getSurch()); 
				ps.setString(76, billData.getMonth2()); 
				ps.setString(77, billData.getRdgDate2()); 
				ps.setString(78, billData.getRdg2()); 
				ps.setString(79, billData.getNetInclSurch1()); 
				ps.setString(80, billData.getMonth3()); 
				ps.setString(81, billData.getRdgDate3()); 
				ps.setString(82, billData.getRdg3()); 
				ps.setString(83, billData.getMonth4()); 
				ps.setString(84, billData.getRdgDate4()); 
				ps.setString(85, billData.getRdg4()); 
				ps.setString(86, billData.getMonth5()); 
				ps.setString(87, billData.getRdgDate5()); 
				ps.setString(88, billData.getRdg5()); 
				ps.setString(89, billData.getMonth6()); 
				ps.setString(90, billData.getRdgDate6());
				ps.setString(91, billData.getRdg6()); 
				ps.setString(92, billData.getAvg1()); 
				ps.setString(93, billData.getAvg2()); 
				ps.setString(94, billData.getCirName2()); 
				ps.setString(95, billData.getBillMsg1()); 
				ps.setString(96, billData.getBillMsg2()); 
				ps.setString(97, billData.getBillMsg3()); 
				ps.setString(98, billData.getBillMsg4()); 
				ps.setString(99, billData.getBillMsg5()); 
				ps.setString(100, billData.getScrnMsg()); 
				ps.setString(101, billData.getBillMonth2()); 
				ps.setString(102, billData.getBillNo2()); 
				ps.setString(103, billData.getLocCod2()); 
				ps.setString(104, billData.getGroupNo2()); 
				ps.setString(105, billData.getReaderNo2()); 
				ps.setString(106, billData.getConsNo2()); 
				ps.setString(107, billData.getConsName2()); 
				ps.setString(108, billData.getChqDate2()); 
				ps.setString(109, billData.getCshDate2()); 
				ps.setString(110, billData.getNetBill3()); 
				ps.setString(111, billData.getNetInclSurch2()); 
				ps.setString(112, billData.getOldConsNo()); 
				ps.setString(113, billData.getSurchargeDemand()); 
				ps.setString(114, billData.getPrevPendingAmnt()); 
				ps.setString(115, billData.getMtrReaderName());
				ps.executeUpdate();
				ResultSet keys = ps.getGeneratedKeys();
				keys.next();
				lastInsertedId = keys.getInt(1);
				insertedBillData = getById(lastInsertedId);
			}  catch (Exception exception) {
				System.out.println("Exception in class : BillDataDAO : method : [insert(BillData)] "
						+ exception.getMessage());
			}
		}
		return insertedBillData;
	}
	
	
	public BillData update(BillData billData){
		BillData insertedBillData = null;
		if(billData != null){
			try(
					Connection connection = GlobalResource.getDatasource().getConnection();
					PreparedStatement ps = connection.prepareStatement(
							"update pre_bill_data set "+DIV_NAME+"=?," +TARIFF+"=?," +LOC_CODE_1+"=?," +GROUP_NO_1+"=?," +READER_NO_1+"=?," +CONS_NO_1+"=?," +BILL_MONTH_1+"=?," +BILL_NO_1+"=?," +BILL_DATE+"=?," +TOT_UNITS_1+"=?," +CONS_NAME_1+"=?," +ADDR_1+"=?," +NET_BILL_1+"=?," +ADDR_2+"=?," +ADDR_3+"=?," +PHONE_1+"=?," +MOBILE+"=?," +CHQ_DATE_1+"=?," +CSH_DATE_1+"=?," +POLE+"=?," +METER_NO+"=?," +PHASE+"=?," +RDG_DATE+"=?," +CONN_LOAD+"=?," +LOAD_UNIT+"=?," +RDG_TYPE+"=?," +CONT_DEM+"=?," +MAX_DEM+"=?," +RDG_CURR+"=?," +RDG_PRE+"=?," +MF+"=?," +PF+"=?," +MTR_UNITS+"=?," +ASS_UNITS+"=?," +TOT_UNITS_2+"=?," +TOD_UNITS+"=?," +LOC_NAME+"=?," +LOC_ADDR_1+"=?," +ENCH+"=?," +LOC_ADDR_2+"=?," +FXCH+"=?," +LOC_PHONE+"=?," +DUTY+"=?," +CESS+"=?," +RENT+"=?," +OFFR_NAME+"=?," +ADJMT+"=?," +OFFR_PHONE+"=?," +SD_INST+"=?," +CAP_SCH+"=?," +DE_NAME+"=?," +PENAL_CH+"=?," +DE_PHONE+"=?," +TOD_SCH+"=?," +PURPOSE+"=?," +SEC_DEP+"=?," +OCH+"=?," +BILL_TYPE+"=?," +SD_DUE+"=?," +ADV_AMT+"=?," +SD_INT+"=?," +PRE_PYMT_HDR+"=?," +LF_REBATE+"=?," +CASH_MSG_1+"=?," +LOCK_CR+"=?," +CASH_MSG_2+"=?," +SUBSIDY+"=?," +CASH_MSG_3+"=?," +MONTH_BILL+"=?," +ARRS+"=?," +NET_BILL_2+"=?," +MONTH_1+"=?," +RDG_DATE_1+"=?," +RDG_1+"=?," +SURCH+"=?," +MONTH_2+"=?," +RDG_DATE_2+"=?," +RDG_2+"=?," +NET_INCL_SURCH_1+"=?," +MONTH_3+"=?," +RDG_DATE_3+"=?," +RDG_3+"=?," +MONTH_4+"=?," +RDG_DATE_4+"=?," +RDG_4+"=?," +MONTH_5+"=?," +RDG_DATE_5+"=?," +RDG_5+"=?," +MONTH_6+"=?," +RDG_DATE_6+"=?," +RDG_6+"=?," +AVG_1+"=?," +AVG_2+"=?," +CIR_NAME_2+"=?," +BILL_MSG_1+"=?," +BILL_MSG_2+"=?," +BILL_MSG_3+"=?," +BILL_MSG_4+"=?," +BILL_MSG_5+"=?," +SCRN_MSG+"=?," +BILL_MONTH_2+"=?," +BILL_NO_2+"=?," +LOC_COD_2+"=?," +GROUP_NO_2+"=?," +READER_NO_2+"=?," +CONS_NO_2+"=?," +CONS_NAME_2+"=?," +CHQ_DATE_2+"=?," +CSH_DATE_2+"=?," +NET_BILL_3+"=?," +NET_INCL_SURCH_2+"=?," +OLD_CONS_NO+"=?," +SURCHARGE_DEMAND+"=?," +PREV_PENDING_AMNT+"=?," +MTR_READER_NAME+"=?"
									+"where id = ?");
					) {
			    ps.setString(1, billData.getDivName()); 
				ps.setString(2, billData.getTariff()); 
				ps.setString(3, billData.getLocCode1()); 
				ps.setString(4, billData.getGroupNo1());
				ps.setString(5, billData.getReaderNo1()); 
				ps.setString(6, billData.getConsNo1()); 
				ps.setString(7, billData.getBillMonth1()); 
				ps.setString(8, billData.getBillNo1()); 
				ps.setString(9, billData.getBillDate()); 
				ps.setString(10, billData.getTotUnits1()); 
				ps.setString(11, billData.getConsName1()); 
				ps.setString(12, billData.getAddr1()); 
				ps.setString(13, billData.getNetBill1()); 
				ps.setString(14, billData.getAddr2()); 
				ps.setString(15, billData.getAddr3()); 
				ps.setString(16, billData.getPhone1()); 
				ps.setString(17, billData.getMobile()); 
				ps.setString(18, billData.getChqDate1()); 
				ps.setString(19, billData.getCshDate1()); 
				ps.setString(20, billData.getPole()); 
				ps.setString(21, billData.getMeterNo()); 
				ps.setString(22, billData.getPhase()); 
				ps.setString(23, billData.getRdgDate()); 
				ps.setString(24, billData.getConnLoad()); 
				ps.setString(25, billData.getLoadUnit()); 
				ps.setString(26, billData.getRdgType()); 
				ps.setString(27, billData.getContDem()); 
				ps.setString(28, billData.getMaxDem()); 
				ps.setString(29, billData.getRdgCurr()); 
				ps.setString(30, billData.getRdgPre()); 
				ps.setString(31, billData.getMf()); 
				ps.setString(32, billData.getPf()); 
				ps.setString(33, billData.getMtrUnits()); 
				ps.setString(34, billData.getAssUnits()); 
				ps.setString(35, billData.getTotUnits2()); 
				ps.setString(36, billData.getTodUnits()); 
				ps.setString(37, billData.getLocName()); 
				ps.setString(38, billData.getLocAddr1()); 
				ps.setString(39, billData.getEnch()); 
				ps.setString(40, billData.getLocAddr2()); 
				ps.setString(41, billData.getFxch()); 
				ps.setString(42, billData.getLocPhone()); 
				ps.setString(43, billData.getDuty()); 
				ps.setString(44, billData.getCess()); 
				ps.setString(45, billData.getRent()); 
				ps.setString(46, billData.getOffrName()); 
				ps.setString(47, billData.getAdjmt()); 
				ps.setString(48, billData.getOffPhone()); 
				ps.setString(49, billData.getSdInst()); 
				ps.setString(50, billData.getCapSch()); 
				ps.setString(51, billData.getDeName()); 
				ps.setString(52, billData.getPenalCh()); 
				ps.setString(53, billData.getDePhone()); 
				ps.setString(54, billData.getTodSch()); 
				ps.setString(55, billData.getPurpose()); 
				ps.setString(56, billData.getSecDep()); 
				ps.setString(57, billData.getOch()); 
				ps.setString(58, billData.getBillType()); 
				ps.setString(59, billData.getSdDue()); 
				ps.setString(60, billData.getAdvAmt()); 
				ps.setString(61, billData.getSdInt()); 
				ps.setString(62, billData.getPrePymtHdr()); 
				ps.setString(63, billData.getLfRebate()); 
				ps.setString(64, billData.getCashMsg1()); 
				ps.setString(65, billData.getLockCr()); 
				ps.setString(66, billData.getCashMsg2()); 
				ps.setString(67, billData.getSubsidy());
				ps.setString(68, billData.getCashMsg3()); 
				ps.setString(69, billData.getMonthBill()); 
				ps.setString(70, billData.getArrs()); 
				ps.setString(71, billData.getNetBill2()); 
				ps.setString(72, billData.getMonth1()); 
				ps.setString(73, billData.getRdgDate1()); 
				ps.setString(74, billData.getRdg1()); 
				ps.setString(75, billData.getSurch()); 
				ps.setString(76, billData.getMonth2()); 
				ps.setString(77, billData.getRdgDate2()); 
				ps.setString(78, billData.getRdg2()); 
				ps.setString(79, billData.getNetInclSurch1()); 
				ps.setString(80, billData.getMonth3()); 
				ps.setString(81, billData.getRdgDate3()); 
				ps.setString(82, billData.getRdg3()); 
				ps.setString(83, billData.getMonth4()); 
				ps.setString(84, billData.getRdgDate4()); 
				ps.setString(85, billData.getRdg4()); 
				ps.setString(86, billData.getMonth5()); 
				ps.setString(87, billData.getRdgDate5()); 
				ps.setString(88, billData.getRdg5()); 
				ps.setString(89, billData.getMonth6()); 
				ps.setString(90, billData.getRdgDate6());
				ps.setString(91, billData.getRdg6()); 
				ps.setString(92, billData.getAvg1()); 
				ps.setString(93, billData.getAvg2()); 
				ps.setString(94, billData.getCirName2()); 
				ps.setString(95, billData.getBillMsg1()); 
				ps.setString(96, billData.getBillMsg2()); 
				ps.setString(97, billData.getBillMsg3()); 
				ps.setString(98, billData.getBillMsg4()); 
				ps.setString(99, billData.getBillMsg5()); 
				ps.setString(100, billData.getScrnMsg()); 
				ps.setString(101, billData.getBillMonth2()); 
				ps.setString(102, billData.getBillNo2()); 
				ps.setString(103, billData.getLocCod2()); 
				ps.setString(104, billData.getGroupNo2()); 
				ps.setString(105, billData.getReaderNo2()); 
				ps.setString(106, billData.getConsNo2()); 
				ps.setString(107, billData.getConsName2()); 
				ps.setString(108, billData.getChqDate2()); 
				ps.setString(109, billData.getCshDate2()); 
				ps.setString(110, billData.getNetBill3()); 
				ps.setString(111, billData.getNetInclSurch2()); 
				ps.setString(112, billData.getOldConsNo()); 
				ps.setString(113, billData.getSurchargeDemand()); 
				ps.setString(114, billData.getPrevPendingAmnt()); 
				ps.setString(115, billData.getMtrReaderName());
				ps.setInt(116, billData.getId());
				ps.executeUpdate();
				/*ResultSet keys = ps.getGeneratedKeys();
				keys.next();
				lastInsertedId = keys.getInt(1);
				insertedBillData = getById(lastInsertedId);*/
			}  catch (Exception exception) {
				insertedBillData = null;
				System.out.println("Exception in class : BillDataDAO : method : [update(BillData)] "
						+ exception.getMessage());
			}
		}
		return insertedBillData;
	}
	
	public ArrayList<BillData> insertAll(ArrayList<BillData> recordsToInsert){
		ArrayList<BillData> insertedRecords = new ArrayList<BillData>();
		if(recordsToInsert != null){
			for(BillData billDataToInsert : recordsToInsert){
				System.out.println("Inserting record");
				BillData insertedRecord = insert(billDataToInsert);
				if(insertedRecord != null){
					insertedRecords.add(insertedRecord);
				}
			}
		}
		return insertedRecords;
	}
	public BillData getById(int id){
		ArrayList<BillData> billDataList = new ArrayList<BillData>();
		try(
				Connection connection = GlobalResource.getDatasource().getConnection();
				PreparedStatement ps = connection.prepareStatement(
						"select * from pre_bill_data where "+ID+" =?");){
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			billDataList = mapper(rs);
		} catch (SQLException e) {
			System.out.println("Exception in class : BillDataDAO : method : [getById(int)] "
					+ e.getMessage());
			e.printStackTrace();
		}
		return billDataList.size() > 0 ? billDataList.get(0):null;
	}
	
	public BillData getByBillDataHeader(){
		ArrayList<BillData> billDataList = new ArrayList<BillData>();
		try(
				Connection connection = GlobalResource.getDatasource().getConnection();
				PreparedStatement ps = connection.prepareStatement(
						"select * from pre_bill_data where "+DIV_NAME+" like '%DIV_NAME%'");){
			//ps.setInt(1,"DIV_NAME");
			ResultSet rs = ps.executeQuery();
			billDataList = mapper(rs);
		} catch (SQLException e) {
			System.out.println("Exception in class : BillDataDAO : method : [getById(int)] "
					+ e.getMessage());
			e.printStackTrace();
		}
		return billDataList.size() > 0 ? billDataList.get(0):null;
	}
	
	
	public ArrayList<BillData> getAll(){
		ArrayList<BillData> billDataList = new ArrayList<BillData>();
		ResultSet rs = null;
		try(
				Connection connection = GlobalResource.getDatasource().getConnection();
				PreparedStatement ps = connection.prepareStatement(
						"select * from pre_bill_data where "+DIV_NAME+" not like '%DIV_NAME%' order by "+READER_NO_1+"::integer");){
			rs = ps.executeQuery();
			billDataList = mapper(rs);
		} catch (SQLException e) {
			System.out.println("Exception in class : BillDataDAO : method : [getById(int)] "
					+ e.getMessage());
			e.printStackTrace();
		}
		return billDataList;
	}
	
	public void deleteAll(){
		try(
				Connection connection = GlobalResource.getDatasource().getConnection();
				PreparedStatement ps = connection.prepareStatement(
						"delete from pre_bill_data");){
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<BillData> getByLocationAndBillMonth( String locationCode, String groupNo, String date){
		ArrayList<BillData> billDataList = new ArrayList<BillData>();
		try(
				Connection connection = GlobalResource.getDatasource().getConnection();
				PreparedStatement ps = connection.prepareStatement(
						"select * from pre_bill_data where "+LOC_CODE_1+" = ? and "+GROUP_NO_1+" = ? and "+BILL_MONTH_1+" = ?");){
			ps.setString(1, locationCode);
			ps.setString(1, groupNo);
			ps.setString(1, date);
			ResultSet rs = ps.executeQuery();
			mapper(rs);
		} catch (SQLException e) {
			System.out.println("Exception in class : BillDataDAO : method : [getByLocationAndBillMonth(String, String, String)] "
					+ e.getMessage());
			e.printStackTrace();
		}
		return billDataList;
	}
	
	public ArrayList<BillData> mapper(ResultSet rs){
		ArrayList<BillData> billDataList = new ArrayList<BillData>();
		try {
			int i = 0;
			while(rs.next()){
				BillData billData = new BillData();
				billData.setId(rs.getInt(1));
				billData.setDivName(rs.getString(2)); 
				billData.setTariff(rs.getString(3)); 
				billData.setLocCode1(rs.getString(4)); 
				billData.setGroupNo1(rs.getString(5));
				billData.setReaderNo1(rs.getString(6)); 
				billData.setConsNo1(rs.getString(7)); 
				billData.setBillMonth1(rs.getString(8)); 
				billData.setBillNo1(rs.getString(9)); 
				billData.setBillDate(rs.getString(10)); 
				billData.setTotUnits1(rs.getString(11)); 
				billData.setConsName1(rs.getString(12)); 
				billData.setAddr1(rs.getString(13)); 
				billData.setNetBill1(rs.getString(14)); 
				billData.setAddr2(rs.getString(15)); 
				billData.setAddr3(rs.getString(16)); 
				billData.setPhone1(rs.getString(17)); 
				billData.setMobile(rs.getString(18));
				billData.setChqDate1(rs.getString(19)); 
				billData.setCshDate1(rs.getString(20)); 
				billData.setPole(rs.getString(21)); 
				billData.setMeterNo(rs.getString(22)); 
				billData.setPhase(rs.getString(23)); 
				billData.setRdgDate(rs.getString(24)); 
				billData.setConnLoad(rs.getString(25)); 
				billData.setLoadUnit(rs.getString(26)); 
				billData.setRdgType(rs.getString(27)); 
				billData.setContDem(rs.getString(28)); 
				billData.setMaxDem(rs.getString(29)); 
				billData.setRdgCurr(rs.getString(30)); 
				billData.setRdgPre(rs.getString(31)); 
				billData.setMf(rs.getString(32)); 
				billData.setPf(rs.getString(33)); 
				billData.setMtrUnits(rs.getString(34)); 
				billData.setAssUnits(rs.getString(35)); 
				billData.setTotUnits2(rs.getString(36)); 
				billData.setTodUnits(rs.getString(37)); 
				billData.setLocName(rs.getString(38)); 
				billData.setLocAddr1(rs.getString(39)); 
				billData.setEnch(rs.getString(40)); 
				billData.setLocAddr2(rs.getString(41)); 
				billData.setFxch(rs.getString(42)); 
				billData.setLocPhone(rs.getString(43)); 
				billData.setDuty(rs.getString(44)); 
				billData.setCess(rs.getString(45)); 
				billData.setRent(rs.getString(46)); 
				billData.setOffrName(rs.getString(47)); 
				billData.setAdjmt(rs.getString(48)); 
				billData.setOffPhone(rs.getString(49)); 
				billData.setSdInst(rs.getString(50)); 
				billData.setCapSch(rs.getString(51)); 
				billData.setDeName(rs.getString(52)); 
				billData.setPenalCh(rs.getString(53)); 
				billData.setDePhone(rs.getString(54)); 
				billData.setTodSch(rs.getString(55)); 
				billData.setPurpose(rs.getString(56)); 
				billData.setSecDep(rs.getString(57)); 
				billData.setOch(rs.getString(58)); 
				billData.setBillType(rs.getString(59)); 
				billData.setSdDue(rs.getString(60)); 
				billData.setAdvAmt(rs.getString(61)); 
				billData.setSdInt(rs.getString(62)); 
				billData.setPrePymtHdr(rs.getString(63)); 
				billData.setLfRebate(rs.getString(64)); 
				billData.setCashMsg1(rs.getString(65)); 
				billData.setLockCr(rs.getString(66)); 
				billData.setCashMsg2(rs.getString(67)); 
				billData.setSubsidy(rs.getString(68)); 
				billData.setCashMsg3(rs.getString(69)); 
				billData.setMonthBill(rs.getString(70)); 
				billData.setArrs(rs.getString(71)); 
				billData.setNetBill2(rs.getString(72)); 
				billData.setMonth1(rs.getString(73)); 
				billData.setRdgDate1(rs.getString(74)); 
				billData.setRdg1(rs.getString(75)); 
				billData.setSurch(rs.getString(76)); 
				billData.setMonth2(rs.getString(77)); 
				billData.setRdgDate2(rs.getString(78)); 
				billData.setRdg2(rs.getString(79)); 
				billData.setNetInclSurch1(rs.getString(80)); 
				billData.setMonth3(rs.getString(81)); 
				billData.setRdgDate3(rs.getString(82)); 
				billData.setRdg3(rs.getString(83)); 
				billData.setMonth4(rs.getString(84)); 
				billData.setRdgDate4(rs.getString(85)); 
				billData.setRdg4(rs.getString(86)); 
				billData.setMonth5(rs.getString(87)); 
				billData.setRdgDate5(rs.getString(88)); 
				billData.setRdg5(rs.getString(89)); 
				billData.setMonth6(rs.getString(90)); 
				billData.setRdgDate6(rs.getString(91)); 
				billData.setRdg6(rs.getString(92)); 
				billData.setAvg1(rs.getString(93)); 
				billData.setAvg2(rs.getString(94)); 
				billData.setCirName2(rs.getString(95)); 
				billData.setBillMsg1(rs.getString(96)); 
				billData.setBillMsg2(rs.getString(97)); 
				billData.setBillMsg3(rs.getString(98)); 
				billData.setBillMsg4(rs.getString(99)); 
				billData.setBillMsg5(rs.getString(100)); 
				billData.setScrnMsg(rs.getString(101)); 
				billData.setBillMonth2(rs.getString(102)); 
				billData.setBillNo2(rs.getString(103)); 
				billData.setLocCod2(rs.getString(104)); 
				billData.setGroupNo2(rs.getString(105)); 
				billData.setReaderNo2(rs.getString(106)); 
				billData.setConsNo2(rs.getString(107)); 
				billData.setConsName2(rs.getString(108)); 
				billData.setChqDate2(rs.getString(109)); 
				billData.setCshDate2(rs.getString(110)); 
				billData.setNetBill3(rs.getString(111)); 
				billData.setNetInclSurch2(rs.getString(112)); 
				billData.setOldConsNo(rs.getString(113)); 
				billData.setSurchargeDemand(rs.getString(114)); 
				billData.setPrevPendingAmnt(rs.getString(115)); 
				billData.setMtrReaderName(rs.getString(116));
				billDataList.add(i, billData);
				i++;
			}
		} catch (SQLException e) {
			System.out.println("Exception in class : BillDataDAO : method : [mapper(ResultSet)] "
					+ e.getMessage());
			e.printStackTrace();
		}
		return billDataList;
	}
}
