-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('交易记录表', '2007', '1', 'transactions', 'lottery/transactions/index', 1, 0, 'C', '0', '0', 'lottery:transactions:list', '#', 'admin', sysdate(), '', null, '交易记录表菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('交易记录表查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'lottery:transactions:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('交易记录表新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'lottery:transactions:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('交易记录表修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'lottery:transactions:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('交易记录表删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'lottery:transactions:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('交易记录表导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'lottery:transactions:export',       '#', 'admin', sysdate(), '', null, '');